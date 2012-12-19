<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>	
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.min.js"></script>
	
	<style type="text/css">
         table.zebra {
            border-collapse: collapse;
         }
         table.zebra th {
            background: #3e83c9;
            color: #ffffff;
            font-weight: bold;
            border-right: 1px solid #ffffff;
         }
         table.zebra tr td {
            border-bottom: 1px solid #95bce2;
            padding: 12px;
         }
         tr.alt td {
            background: #ecf6fc;
         }
    </style>
	
	
	<script type="text/javascript">
      $(document).ready(
         function() {
            $(".zebra tr:even").addClass("alt");
         }
      );
      </script>
	
	<script type="text/javascript">
	$(document).ready(
	   function(){
		  $(".zebra tr").mouseover(
			 function() {
				$(this).addClass("over");
			 }
		  ).mouseout(
			 function() {
				$(this).removeClass("over");
			 }
		  );
		  $(".zebra tr:even").addClass("alt");
	   }
	);
	</script>

	<title>Sys | UsuarioGridy</title>
	
</head>
<body>

<h2 style="text-align:left; padding:25px; font-weight:bold; font-size:20px;">Listagem de usuários cadastrados</h2>
		<table class="zebra">
			<tbody>
				<tr>
					<th>Nome</th>
					<th>Senha</th>
				</tr>
				<c:forEach items="${usersList}" var="user">
					<tr class="cor">
						<td>${user.nomeUser}</td>
						<td>${user.senha}</td>
					</tr>
				</c:forEach>
				
			</tbody>
		</table>
</body>