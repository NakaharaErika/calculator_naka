package study;

public class Study { //基本的にmainメソッドで実行できます。コードを書かない設問に関しては、心の中で呟く程度でOKです。
					//配列、ループ構造は1からコードを書く必要があります。
	
	//Chapter1 Java基礎
	
	/*1.クラス宣言に含めることができるものは？
	 * A. メソッド→⚪︎クラス内で定義される関数
	 * B. フィールド→⚪︎クラス内で定義される変数、プロパティ
	 * C. インポート宣言→×
	 * D. パッケージ宣言→×
	 * E. コンストラクタ→⚪︎インスタンスの初期化
	 * */
	
	/*2.次のうち、インポート宣言をしなくても自動的にインポートされるものは？
	 * A. java.langパッケージ→⚪︎
	 * B. java.langパッケージのうち、StringクラスとSystemクラスの2つのみ
	 * C. 同じパッケージに属するクラス→そもそもimportが不要
	 * D. サブパッケージに属するクラス→別途importが必要
	 * */
	
	/*3.次のプログラムをコンパイル、実行した時の結果は？　※実行コマンドは、java Main java one two
	 * public class Main {
	 *	   public static void main(String[]  args) {
	 *			System.out.println(args[0] + " " + args[1]);
	 *	   }
	 * }
	 * java one
	 * */
	
	//---------------------------------------------------------//
	
	//Chapter２ データ型
	/*
	 * 1.次のプログラムを実行した結果のエラーを解消してください。
	 * 
	 * public class Main {
		public static void main(String[] args) {
			int val = 7;
			bool flg = true;
			if(flg == true) {
				do {
					System.out.println(val);
				}while(val > 10);
			}
		}
	}Booleanに変更
	val++;
	}while(val < 10);にしたら,valがカウントアップされる
	 *
	 * 2.次のコードのうち、コンパイルエラーになるものを選べ。また、その理由も述べよ。
	 * 
	 * A. int a = 0x10B;→0xは16進数
	 * B. int b = 0827;→0は8進数。8は８進数には含まれない
	 * 
	 * 3.次のコードのうち。コンパイルエラーになる式を選べ。また、理由も述べよ。
	 * 
	 * A. int a = 123_456_789;⚪︎
	 * B. int b = 5________2;○使用回数に制限はない
	 * C. int c = 123_456_789_;×末尾には使用できない
	 * D. int d = 0x_52;×8進などの後はOK。読みやすくなるし。でも16進数、お前はダメだ
	 * E. int e = 3_.1415F;×Fはfloat型でしか使えない。ついでに、.の前でも使えない
	 * アンダースコアはカンマの代わりにできる。
	 * 
	 * 4.次の空欄を埋め、コンソールにNULLと表示させたい。空欄に入るコードを選べ。
	 * 
	 * public class Main {
		public static void main(String[] args) {
			(                    )
			System.out.println(obj);
		}
	}
	 * A. Object obj = null;　nullになる
	 * B. Object obj = false;　falseになる
	 * C. Object obj = NULL;　大文字にすると別の物扱い。文字列かなんかにする必要がある
	 * D. Object obj = ""; ""になる
	 * E. 全て違う。
	 * 
	 * 
	 * 5.空欄に記述できるコードを選べ。
	 * 
	 * public class Main {
		public static void main(String[] args) {
			int a = 1;
			int b = 2;
			(                    )
			int c = b;
		}
	}
	 *A. System.out.println(a);○
	 *B. System.out.println(b + 2); 4になる
	 *C. System.out.println(c); 先に変数定義しないといけない
	 *D. System.out.println(d); dは存在しない
	 * 
	 * */
	
	//---------------------------------------------------------//
	
	//Chapter3 演算子と判定構造
	
	/*1.次のプログラムをコンパイル、実行した時の結果を選べ。
	 * 
	 * public class Main {
		public static void main(String[] args) {
			int a = 3;
			int b = a += 5;
			System.out.println(a + b);
		}
	}
	 *A. 8
	 *B. 10
	 *C. 16
	 *D.コンパイルエラー
	 *a = a + 5 でaは8になる、b = a　なのでbも８になる
	 *
	 *2.次のプログラムをコンパイル、実行した時の結果を選べ。
	 *
	 *public class Main {
		public static void main(String[] args) {
			int num = -10;
			System.out.println(10 * -num);
		}
	}
	 *A. 100
	 *B. -100
	 *C. コンパイルエラー
	 *D. 例外が吐かれる
	 *-(10)*10=100
	 *
	 *3.次のコードのコンパイルした時の結果を選べ。
	 *※インクリメント、デクリメントに関する問題。前置、後置の知識が必要。
	 *
	 *public class Main {
		public static void main(String[] args) {
			int a = 10;
			int b = a++ + a + a-- - a-- + ++a;
			System.out.println(b);
		}
	}
	A. 7
	B. 32
	C. 33
	D. コンパイルエラー
	10+11+11-10+11
	
	4.次のプログラムを実行した時、「yes」と表示したい。正しいコードを選べ。※三項演算子の問題。
	public class Main {
		public static void main(String[] args) {
			String a = "A";
			String b = "B";
			String c = (             );
			System.out.println(c);
		}
	}
	 * 
	 * A. a.equals(b) ? "yes" : "no"→noと出る
	 * B. a.equals(b) ? "no" : "yes" →yesと出る
	 * B. a.equals(b) : "no" : "yes" →エラーになる
	 * B. a.equals(b) : "yes" : "no"　→エラーになる 
	 * 
	 * 5. 次のプログラムをコンパイル、実行した結果を選べ。
	 * 
	 * public static void main(String[] args) {
			String a = 10;
			String b = 10;
			if (10 < a && 10 < ++b) {
			    a++;
			}
			System.out.println(a + b);
		}
	}
	 *A. 21
	 *B. 20
	 *C. 22
	 *C. コンパイルエラー
	 *int型じゃないのでエラー。int a=11なら23が出力される
	 *
	 *6.次のプログラムをコンパイル、実行した結果を選べ。 ※if文の{}が省略された場合の挙動。
	 *
	 *public class Main {
		public static void main(String[] args) {
			if(false) 
				System.out.println("A");
				System.out.println("B");
		}
	}
	 *A. "A"だけが表示される
	 *B. "B"だけが表示される
	 *C. 両方表示される
	 *D. コンパイルエラー、あるいは例外
	 *
	 *{}がない場合、最初の１行に関してだけ{}が適用される
	 * */
	
	
	
	//---------------------------------------------------------//
	
	//Chapter4 配列
	
	/*1.配列の要素をすべて合計するプログラムを書け。
	 * int[] sums = {1,2,3};
			int sum = 0;
			
			for (int i : sums) {
				sum += i;
			}
			System.out.println(sum);
	 * 2.配列の最大値を見つけるプログラムを書け。
	 * int[] sums = {1,3,2};
			int max = sums[0];
			for (int i : sums) {
				if(i > max) max = i;
			}
			System.out.println(max);
	 * 3.配列内の特定の要素を探すプログラムを書け。
	 * int[] sums = {1,3,2};
			int looking = 1;
			int i;
			for (i = 0; i < sums.length; i++) {
				if(looking == sums[i]) {
					break;
				}
			}
			System.out.println(looking + "は" + i + "番目の要素だよ");
	 * 4.配列を逆順にするプログラムを書け。
	 * String[] num = {"stay","ble","wao"};
			List<String> list = Arrays.asList(num);
			ArrayList<String>newArr = new ArrayList<>(list);
			Collections.reverse(newArr);
			System.out.println(newArr);
			
			米：integerかstringで有効
	 * 5.配列内の重複要素を見つけるプログラムを書いてください。
	 * String[] num = {"stay","ble","wao","ble"};
	        Set<String> unique = new HashSet<>();
	        
	        for (String element : num) {
				if(!unique.add(element)) {
					System.out.println(element +"が重複したよ");
				}
			}
			
			setは重複を許さないリスト
			
	 * 6. 次のmainメソッドの中から、エラーが発生する箇所を選べ(発生しないことも考慮)。※エディタにコピペする前に考えてみて。
	 * 
	 * public class Main {
		public static void main(String[] args) {
			int[] a;
			int b[];
			int[][] c;
			int d[][];
			int[] e[];
			int[][] f[];これはだめだよ
		}
	}
	 * 
	 * */
	
	//Chapter5 ループ構造　
	
	/*1. 1から10までの数字を印刷するプログラムを書け。
	 * for (int i = 1; i < 11; i++) {
				System.out.println(i);
			}
	 * 2. 与えられた整数nまでの全ての偶数を印刷するプログラムを書け。※ここでは、n=10とする。
	 * int n = 10;
			for (int i = 0; i < n; i++) {
				if(i % 2 == 0) System.out.println(i);
			}
	 * 3. 与えられた配列の各要素を印刷するプログラムを書け。※拡張for文で回答してください。
	 * int[] arr = {1,2,3,4,5};
			for (int i : arr) {
				System.out.println(i);
			}
	 * 4. 10から1までカウントダウンするプログラムを書け。
	 * for (int i = 11; i > 1; i--) {
				System.out.println(i);
			}
	 * 5. 'n' 回 "Hello, World!" を印刷するプログラムを書け。ただし、'n' はユーザーが入力した回数です。※Scanneを使います。
	 * canner scanner = new Scanner(System.in);
			String text = scanner.next();
			for (int i = 0; i < 10; i++) {
				System.out.println(text);
			}
			scanner.close();
	 * */
	
	
	//---------------------------------------------------------//
	
	//Chapter6 メソッドとカプセル化

	/*1.メソッドとは？
	 * A.クラス内で定義される関数
	 * 2.カプセル化とは？
	 * A.クラス内の内容を隠蔽すること
	 * 3. privateアクセス修飾子の役割は？
	 * A.宣言されたクラス内のみでアクセス可能
	 * 4.メソッドが値を返さない場合のキーワードは？
	 * A.voidを使う
	 * 5.オーバーロードとは？
	 * A.親クラスと同じメソッド名の時、子クラスのメソッドが優先して使用される。←それはオーバーライド
	 * オーバーロードは同じメソッド名で異なるシグネチャを持つメソッドを同一クラス内で複数定義できること
	 * */
	
	//---------------------------------------------------------//
	
	//Chapter7 継承

	/*1. 次のAnimalクラスを継承するDogサブクラスを作成し、
	 * AnimalクラスのmakeSoundメソッドをオーバーライドして、
	 * 「Bark!」と印刷するようにコードを完成させよ。
	 * 
	 * class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}	
Animal animal = new Dog();
			animal.makeSound();

	 * 2. 次のBicycleクラスを継承するMountainBikeクラスを作成し、
	 * MountainBikeクラスにgear属性を追加せよ。
	 * また、MountainBikeクラスのコンストラクタを完成させ、
	 * gear属性を設定せよ。
	 * 
	 * class Bicycle {
    int speed;

    Bicycle(int startSpeed) {
        speed = startSpeed;
    }

    void applyBrake(int decrement) {
        speed -= decrement;
    }

    void speedUp(int increment) {
        speed += increment;
    }
}
	
	//---------------------------------------------------------//
	
	//Chapter8 例外処理

	/*1.次のプログラムは、整数の除算を行うメソッドdivideNumbersが含まれている。
	 * 0による除算を試みるとArithmeticExceptionが発生する。この例外をキャッチして、
	 * 「0で割れません。」というメッセージを印刷するようにtry-catchブロックを完成させよ。
	 * 
	 *public class ExceptionTest {
    public static int divideNumbers(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = divideNumbers(a, b);
            System.out.println("Result: " + result);
        } catch (________) { 
            System.out.println("________"); 
        }
    }
}

	 * 2.次のプログラムでは、ファイルからテキストを読み取る処理を行っている。
	 * ファイルが存在しない場合はFileNotFoundExceptionが発生する。
	 * この例外をキャッチして、「ファイルがない。」というメッセージを印刷するようにtry-catchブロックを完成させてください。
	 * 
	 * import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileReadTest {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonexistentfile.txt");
            // 他のファイル読み取り処理
        } catch (________ e) { // <- ここを埋めてください
            System.out.println("________"); // <- ここを埋めてください
        }
    }
}
	 * */
	
	//---------------------------------------------------------//
	

}