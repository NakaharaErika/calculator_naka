function addValue(value) {
    // 0や小数点が先頭　小数点が複数回追加されないようにチェック
    if (value === '.' && display.value.includes('.') || value === '.' && display.value === ('')) {
        return;
    } else if ((value === '0'||value ==='00') && display.value === ('')) {
		return;
	}
	//イコールフラグが立っている時は、値をクリアして入力。イコールフラグも元に戻す
	if (document.getElementById('equalPressed').value === "true"){
			document.getElementById("display").value = value;
			document.getElementById("equalPressed").value = "";
			console.log("たてたよ")
		return;
	}
    document.getElementById("display").value += value;
}

function sendCalculation() {
	//何も表示されていない状態でイコールを押した場合の処理
	if (document.getElementById('operation').value === ''||document.getElementById('display').value === ''){
		return;
	}else{
		// イコール演算子フラグをtrueにして計算開始
    document.getElementById('equalPressed').value = "true"; 
    document.getElementById('form').submit();
    }
}

function setOperation(operation) {
	// すでに演算子欄に値がある場合は、隠し演算子欄に直近の演算子を入れて計算開始
    if(document.getElementById('operation').value != ''){
		document.getElementById('subOperation').value = operation;
    	document.getElementById('form').submit();
    } else {
	// そうでない場合は、演算子欄と直近値欄に値を転記する
    document.getElementById('operation').value = operation;
    document.getElementById('previousValue').value = document.getElementById('display').value;
    document.getElementById("display").value = '';
    }
}

//Cボタン
function clearDisplay() {
    document.getElementById("display").value = '';
    document.getElementById("operation").value = '';
    document.getElementById("previousValue").value = '';
    document.getElementById('equalPressed').value = '';
}


// 文字数制限
function truncateInput(inputElement) {
    if(inputElement.value.length > 5) {
        inputElement.value = inputElement.value.substring(0, 5);
    }
}

// 関数を利用して特定のinput要素を監視
document.addEventListener('DOMContentLoaded', (event) => {
    // 例えば、サーバーから値が設定された後に以下の関数を呼び出します
    truncateInput(document.getElementById('display'));
    // 他のinput要素に対しても同様に適用
});
