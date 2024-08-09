<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Stock Mate</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            color: white;
            background: linear-gradient(45deg, #111, #333);
            margin: 0;
            padding: 0;
        }
        
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px;
            background-color: #202020;
        }

        .navbar-logo h1 {
            color: white;
        }

        nav ul {
            list-style: none;
            display: flex;
            gap: 20px;
        }

        nav ul li a {
            color: white;
            text-decoration: none;
        }

        .navbar-buttons .login-btn,
        .navbar-buttons .signup-btn {
            padding: 10px 20px;
            margin-left: 10px;
            border: none;
        }

        .signup-btn {
            background-color: red;
            color: white;
            border-radius: 5px;
        }

        .hero {
            text-align: center;
            padding: 50px;
            background: radial-gradient(circle, rgba(46,46,46,1) 0%, rgba(14,14,14,1) 100%);
        }

        .hero-content h2 {
            font-size: 2.5rem;
        }

        .highlight {
            color: red;
        }

        .cta-button {
            background-color: red;
            color: white;
            padding: 15px 30px;
            border: none;
            font-size: 1.2rem;
            margin: 20px 0;
        }

        .features {
            display: flex;
            justify-content: center;
            gap: 20px;
            margin-top: 20px;
        }

        .logos img {
            margin: 10px;
            width: 100px;
        }

        .how-it-works {
            text-align: center;
            padding: 50px;
            background-color: #333;
        }

        .how-it-works h3 {
            font-size: 2rem;
            color: red;
        }
    </style>
</head>
<body>
    <!-- Navbar Section -->
    <header class="navbar">
        <div class="navbar-logo">
            <h1>Stock Mate</h1>
        </div>
        <nav>
            <ul>
                <li><a href="#home">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#how-to-use">How To Use</a></li>
                <li><a href="#pricing">Pricing</a></li>
                <li><a href="#contact">Contact Sales</a></li>
            </ul>
        </nav>
        <div class="navbar-buttons">
            <button class="login-btn">Log in</button>
            <button class="signup-btn">Sign up for free</button>
        </div>
    </header>

    <!-- Hero Section -->
    <section class="hero">
        <div class="hero-content">
            <h2>Meet <span class="highlight">Stock Mate</span></h2>
            <p>Unleash the Power of SMART Trading.</p>
            <button class="cta-button">Get Trial Access</button>
            <div class="features">
                <p>✔ Zero trading skills needed</p>
                <p>✔ Works for all markets</p>
                <p>✔ Immediate access</p>
            </div>
            <div class="logos">
                <img src="marketwatch-logo.png" alt="MarketWatch">
                <img src="yahoo-news-logo.png" alt="Yahoo News">
                <img src="discord-logo.png" alt="Discord">
                <img src="tradingview-logo.png" alt="TradingView">
            </div>
        </div>
    </section>

    <!-- How It Works Section -->
    <section class="how-it-works">
        <h3>How It Works</h3>
        <p>Stock Mate Algo uses advanced algorithms and real-time data to pinpoint optimal buy and sell entry points.</p>
        <p>Our AI-powered system removes emotional decision-making, giving you data-backed trading signals to follow.</p>
    </section>
</body>
</html>
