<html>
<body>
<h2>Dubbo-demo!</h2>
<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
			type:"post",
			url:"/user/select.htm",
			data:{"id":6},
			dataType:"json",
			success:function(data){
				alert(data.user.username);
			},
			error:function(data){
				alert("error");
			}
		});
	});
</script>
</body>
</html>
