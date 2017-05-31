<html>
<body>
<h2>Hello World!</h2>
<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
			type:"post",
			url:"/goods/select.htm",
			data:{"id":1},
			dataType:"json",
			success:function(data){
				alert(data.goods.goodsName);
			},
			error:function(data){
				alert("error");
			}
		});
	});
</script>
</body>
</html>
