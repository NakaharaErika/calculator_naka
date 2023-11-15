function addValue(value) {
    // 0や小数点が先頭　小数点が複数回追加されないようにチェック
    if (value === '.' && display.value.includes('.') || value === '.' && display.value === ('')) {
        return;
    } else if ((value === '0'||value ==='00') && display.value === ('')) {
		return;
	}
    document.getElementById("display").value += value;
}

function sendCalculation() {
	//何も表示されていない状態でイコールを押した場合の処理
	if (document.getElementById('operation').value === ''||document.getElementById('display').value === ''){
		return;
	}else{
    document.getElementById('equalPressed').value = "true"; // イコール演算子フラグをtrue
    document.getElementById('form').submit();
    }
}

function setOperation(operation) {
	// すでに演算子欄に値がある場合はフォームを送信
    if(document.getElementById('operation').value != ''){
		document.getElementById('subOperation').value = operation;
    	document.getElementById('form').submit();
    } else {
    document.getElementById('operation').value = operation;
    document.getElementById('previousValue').value = document.getElementById('display').value;
    document.getElementById("display").value = '';
    }
    
    console.log(operation);
}


function clearDisplay() {
    document.getElementById("display").value = '';
    document.getElementById("operation").value = '';
    document.getElementById("previousValue").value = '';
    document.getElementById('equalPressed').value = '';
}