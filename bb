<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>San Valentino</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f8d7e6;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            text-align: center;
        }
        .container {
            position: relative;
            padding: 40px;
            background: rgba(255, 255, 255, 0.8);
            border-radius: 15px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
            overflow: hidden;
        }
        .heart {
            font-size: 80px;
            color: #ff5c8d;
        }
        .message {
            font-size: 32px;
            color: #d14f5d;
            font-weight: bold;
            margin-top: 20px;
            cursor: pointer;
            text-decoration: underline;
        }
        .flower {
            font-size: 40px;
            color: #ff9b9b;
        }
        .heart-container {
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            pointer-events: none;
        }
        .heart-container span, .flower-container span {
            position: absolute;
            animation: float 4s ease-in-out infinite;
        }
        @keyframes float {
            0% {
                transform: translateY(0);
            }
            50% {
                transform: translateY(-20px);
            }
            100% {
                transform: translateY(0);
            }
        }
        .flower-container {
            position: absolute;
            top: 20px;
            left: 50%;
            transform: translateX(-50%);
        }
    </style>
</head>
<body>
    <div class="container">
        <!-- Cuori in movimento -->
        <div class="heart-container">
            <span style="top: 20px; left: 10px;">❤️</span>
            <span style="top: 50px; left: 200px;">❤️</span>
            <span style="top: 120px; left: 150px;">❤️</span>
            <span style="top: 180px; left: 300px;">❤️</span>
            <span style="top: 250px; left: 100px;">❤️</span>
            <span style="top: 350px; left: 250px;">❤️</span>
            <span style="top: 200px; left: 50px;">❤️</span>
            <span style="top: 300px; left: 350px;">❤️</span>
            <span style="top: 100px; left: 400px;">❤️</span>
        </div>
        
        <!-- Fiori animati -->
        <div class="flower-container">
            <span style="top: 50px; left: 50px;" class="flower">💐</span>
            <span style="top: 150px; left: 150px;" class="flower">💐</span>
            <span style="top: 250px; left: 250px;" class="flower">💐</span>
            <span style="top: 350px; left: 350px;" class="flower">💐</span>
        </div>

        <!-- Cuore centrale -->
        <div class="heart">❤️</div>

        <!-- Messaggio cliccabile per andare alla pagina di modifica -->
        <div class="message" onclick="window.location.href='pagina_messaggio.html';">下午好呀宝宝，点点我！我有话要跟你说💕</div>
    </div>
</body>
</html>
