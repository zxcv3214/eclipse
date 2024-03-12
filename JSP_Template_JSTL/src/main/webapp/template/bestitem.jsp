<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
</head>
<body>

<div class="container mt-3">
  <h2>인기 목록 Table</h2>
  <p>상품입력하세요.</p>  
  <input class="form-control" id="myInput" type="search" placeholder="Search..">
  <br>
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>상품이름</th>
        <th>가격</th>
        <th>제조사</th>
      </tr>
    </thead>
    <tbody id="myTable">
      <tr>
        <td>스팸</td>
        <td>3000</td>
        <td>CJ</td>
      </tr>
      <tr>
        <td>비타민</td>
        <td>1000</td>
        <td>광동</td>
      </tr>
      <tr>
        <td>돈까스</td>
        <td>7000</td>
        <td>오뚜기</td>
      </tr>
      <tr>
        <td>한우</td>
        <td>10000</td>
        <td>마장동</td>
      </tr>
    </tbody>
  </table>
  <p></p>
</div>

<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
    	console.log($(this).text().toLowerCase().indexOf(value) > -1)
    	
//toggle(true)는 선택한 요소를 보이도록 설정하는 메소드입니다.
//toggle(false)는 선택한 요소에 style="display : none;" 속성이 추가되어 보이지 않게 합니다.
    $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)  
    });
  });
});
</script>
</body>
</html>