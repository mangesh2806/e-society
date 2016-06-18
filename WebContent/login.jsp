<html lang="en">
 <head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Dark Login Form</title>
  <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" >
  
</head>
<body>
  <form method="post" action="loginAction" class="login">
    <p>
      <label for="login">User ID:</label>
      <input type="text" name="userId" id="login" placeholder="User ID">
    </p>

    <p>
      <label for="password">Password:</label>
      <input type="password" name="password" id="password" placeholder="Password">
    </p>

    <p class="login-submit">
      <button type="submit" class="login-button">Login</button>
    </p>

    <p class="forgot-password"><a href="index.html">Forgot your password?</a></p>
  </form>

  </body>
</html>
