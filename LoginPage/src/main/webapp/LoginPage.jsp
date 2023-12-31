<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <style type="text/css">
 body {
  margin: 0;
  padding: 0;
  background-image: url("https://wallpapercave.com/wp/wp2939973.jpg");
  font-family: Arial, sans-serif;
  background-size: cover;
 
  background-color: #f5f5f5;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.login-container {
  background: rgba(0,0,0,0.5);
  color:#fff;
  transform:translate(-50%,-50%);
  box-sizing: border-box;
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  padding: 20px;
  width: 350px;
  text-align: center;
}

.login-container h2 {
  margin-bottom: 20px;
}

.login-form {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.login-form label {
  margin-bottom: 6px;
  font-weight: bold;
}

.login-form input {
  width: 100%;
  padding: 10px;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.login-form button {
  background-color: #007bff;
  color: #fff;
  border: none;
  border-radius: 4px;
  padding: 10px 20px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

.login-form button:hover {
  background-color: #0056b3;
}
.social-icons {
  margin-top: 20px;
}

.social-icons a {
  display: inline-block;
  margin: 0 8px;
}

.social-icons img {
  width: 24px;
  height: 24px;
  opacity: 0.6;
  transition: opacity 0.3s ease;
}

.social-icons img:hover {
  opacity: 1;
}
 </style>
  <title>𓄂BɛaŞt</title>
</head>
<body>
  <div class="login-container">
    <h2>Login</h2>
    <form class="login-form" action="anu">
      <label for="username">UserEmail</label>
      <input type="text" id="username" name="username" required>
      
      <label for="password">Password</label>
      <input type="password" id="password" name="password" required>
      
      <button type="submit">Login</button>
    </form>
        <div class="social-icons">
        <a href="#"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Instagram_icon.png/2048px-Instagram_icon.png" alt="Instagram"></a>
        <a href="#"><img src="data:image/png;base64,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" alt="LinkedIn"></a>
        <a href="#"><img src="data:image/jpeg;base64,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" alt="Twitter"></a>
      </div>
  </div>
</body>
</html>