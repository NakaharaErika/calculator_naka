<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>計算機</title>
<script src="./js/script.js"></script>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<div class="grid">
	<form id ="form" action="calcu" method="post">
		<div class="sideInput">
			<input type="text" id="previousValue" name="previousValue" maxlength="5" value="<%= (String)request.getAttribute("result")%>" readonly>
			<input type="text" id="operation" name="operation" value="<%= (String)request.getAttribute("nextOperation") %>" readonly>
		</div>
		<input type="text" id="display" name="currentValue"  maxlength="5" value="<%= (String)request.getAttribute("resultFinal")%>" readonly><br>
		
		
		
		<!-- 各種ボタン -->
		<br>
        <button type="button" class="gray" onclick="clearDisplay()">C</button>
        <button type="button" class="gray">控		    </button>
        <button type="button" class="gray">控		    </button>
        <button type="button" class="orange" onclick="setOperation('/')">/</button><br>
        
		<button type="button" onclick="addValue('7')">7</button>
		<button type="button" onclick="addValue('8')">8</button>
		<button type="button" onclick="addValue('9')">9</button>
		<button type="button" class="orange" onclick="setOperation('*')">×</button><br>
		
		
		<button type="button" onclick="addValue('4')">4</button>
		<button type="button" onclick="addValue('5')">5</button>
		<button type="button" onclick="addValue('6')">6</button>
		<button type="button" class="orange" onclick="setOperation('-')">-</button><br>
		
		
		<button type="button" onclick="addValue('1')">1</button>
		<button type="button" onclick="addValue('2')">2</button>
		<button type="button" onclick="addValue('3')">3</button>
		<button type="button" class="orange" onclick="setOperation('+')">+</button><br>
		
		<button type="button" onclick="addValue('0')">0</button>
		<button type="button" onclick="addValue('00')">00</button>
		<button type="button" onclick="addValue('.')">.</button>
		<!-- 等号ボタン -->
		<button type="button" class="orange" onclick="sendCalculation()">=</button>
		<br>
		<!-- 隠し要素 -->
		<input type="text" id="subOperation" name="subOperation" readonly><br>
		<input type="text" id="equalPressed" name="equalPressed" value="<%= (String)request.getAttribute("equalPressed")%>" eadonly>
     
	</form>
	</div>
	
</body>
</html>