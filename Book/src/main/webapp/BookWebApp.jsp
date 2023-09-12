<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="ISO-8859-1">
      <title>Insert title here</title>
      <link rel="stylesheet" href="css/bootstrap.css">
   </head>
   <body class="container-fluid card" style="width:40rem;">
      <h2 class="bg-danger text-white text-center">Book Registration</h2>
      <form action="register" method="post">
         <table class="table table-hover">
            <tr>
               <td>Book Name</td>
               <td><input type="text" name="bookName"></td>
            </tr>
            <tr>
               <td>Book Edition</td>
               <td><input type="text" name="bookEdition"></td>
            </tr>
            <tr>
               <td>Book Price</td>
               <td><input type="text" name="bookPrice"></td>
            </tr>
            <tr>
               <td><input type="submit" value="register"></td>
               <td><input type="reset" value="cancel"></td>
            </tr>
         </table>
         <a href='bookList'>Book List</a>
      </form>
   </body>
</html>