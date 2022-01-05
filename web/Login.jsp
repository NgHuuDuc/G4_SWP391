<%-- 
    Document   : Login
    Created on : Jan 4, 2022, 9:07:54 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="login">
            <div>
                <span>Log In to Your QuizPractice Account!</span>
            </div>
            </br>
            Email
            </br>
            <input type="text" name="" value="" />
            </br>
            Password
            </br>
            <input type="text" name="" value="" />
            </br>
            <input type="submit" name="" value="Log In" />
            </br>
            or <a href="#">Forgot Password</a>
            </br>
            <a href="https://www.facebook.com/login.php">Continue with Facebook</a>
            </br>
            <a href="https://accounts.google.com/signin/v2/identifier?hl=vi&passive=true&continue=https%3A%2F%2Fwww.google.gg%2F&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin">Continue with Google</a>
            </br>
            Don't have an account? <a href="#">Sign Up</a>
        </form>
    </body>
</html>
