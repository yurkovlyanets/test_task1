<html>
   <head> 
    <title>Users</title>
</head>
<body>
<ul>
    <#list orders as order>
    <li>${order.orderNumber} ${order.orderadddate}</li>
</#list>
</ul>
</body>
</html>