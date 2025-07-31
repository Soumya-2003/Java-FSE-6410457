// src/App.js
import React, { useState } from 'react';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  return (
    <div className="App">
      <header className="App-header">
        <h1>✈️ Flight Ticket Booking</h1>
        {isLoggedIn ? (
          <button onClick={handleLogout} className="logout-button">
            Logout
          </button>
        ) : (
          <button onClick={handleLogin} className="login-button">
            Login
          </button>
        )}
      </header>

      <main>
        {isLoggedIn ? <UserPage /> : <GuestPage />}
      </main>
    </div>
  );
}

function GuestPage() {
  return (
    <div>
      <h2>Welcome, Guest!</h2>
      <p>You can browse flight details, but you must log in to book tickets.</p>

      <div className="flight-list">
        <h3>Available Flights</h3>
        <FlightCard flight="AI-101" from="Delhi" to="Mumbai" time="08:00 AM" price="₹4,500" />
        <FlightCard flight="AI-202" from="Bangalore" to="Chennai" time="12:30 PM" price="₹3,200" />
        <FlightCard flight="AI-303" from="Kolkata" to="Hyderabad" time="05:45 PM" price="₹3,800" />
      </div>

      <p className="guest-message">
        🔐 Please <strong>login</strong> to book tickets.
      </p>
    </div>
  );
}

function UserPage() {
  return (
    <div>
      <h2>Welcome Back, User! 👋</h2>
      <p>You are now logged in. You can book tickets.</p>

      <div className="flight-list">
        <h3>Available Flights</h3>
        <FlightCard flight="AI-101" from="Delhi" to="Mumbai" time="08:00 AM" price="₹4,500" canBook={true} />
        <FlightCard flight="AI-202" from="Bangalore" to="Chennai" time="12:30 PM" price="₹3,200" canBook={true} />
        <FlightCard flight="AI-303" from="Kolkata" to="Hyderabad" time="05:45 PM" price="₹3,800" canBook={true} />
      </div>
    </div>
  );
}

function FlightCard({ flight, from, to, time, price, canBook = false }) {
  return (
    <div className="flight-card">
      <p><strong>Flight:</strong> {flight}</p>
      <p><strong>From:</strong> {from}</p>
      <p><strong>To:</strong> {to}</p>
      <p><strong>Departure:</strong> {time}</p>
      <p><strong>Price:</strong> {price}</p>
      {canBook && <button className="book-button">Book Now</button>}
    </div>
  );
}

export default App;