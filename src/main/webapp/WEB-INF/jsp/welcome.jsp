<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
    <style>

        body, h1, p, ul, li {
            margin: 0;
            padding: 0;

        }

        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
        }
        fieldset{
        background-color:white;
        margin-left:300px;
        margin-right:300px;
        margin-top:150px;
        }

        h1 {
            text-align: center;
            padding: 20px 0;
            color: #333;
        }
        h1:hover{
        color:blue;
        text-decoration:underline;
        }

        p {
            text-align: center;
            margin: 20px 0;
            color: #666;
        }

        ul {
            list-style-type: none;
            text-align: center;
            margin-top: 30px;
        }

        li {
            margin-bottom: 15px;
            font-size:18px;
        }

        a {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #0056b3;
        }

        .option:hover {
            background-color: #f0f0f0;
            color: #007bff;
        }
    </style>
</head>
<body>
<fieldset>
    <div class="container">
        <h1>W E L C O M E</h1>

        <ul>
           <li class="option" onclick="redirectTo('/login')">Login to Movie Page</li>
            <li class="option" onclick="redirectTo('/add-movie')">Add a Movie</li>
            <li class="option" onclick="redirectTo('/add-theatre')">Add a Theatre</li>
        </ul>
    </div>
</fieldset>
    <script>
        function redirectTo(url) {
            window.location.href = url;
        }
    </script>
</body>
</html>
