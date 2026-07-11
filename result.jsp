<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Result</title>
  <link rel="stylesheet" href="css/style.css" />
</head>
<body>
  <header>
    <div class="logo">FakeNews AI</div>
    <nav>
      <a href="index.html">Home</a>
      <a href="about.html">About</a>
      <a href="detect.html">Detect News</a>
      <a href="contact.html">Contact</a>
    </nav>
  </header>

  <main class="page">
    <h2>Prediction Result</h2>
    <div class="result-box">
      <p><strong>Entered News:</strong> <%= request.getAttribute("newsText") %></p>
      <p><strong>Prediction:</strong> <span class="prediction"><%= request.getAttribute("prediction") %></span></p>
      <p><strong>Reason:</strong> <%= request.getAttribute("reason") %></p>
    </div>
    <a href="detect.html" class="btn">Check Another</a>
  </main>
</body>
</html>