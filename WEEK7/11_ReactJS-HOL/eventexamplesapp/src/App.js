import React, { Component } from 'react';
import './App.css';
import CurrencyConverter from './CurrencyConverter';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
    };
  }

  // 1a. Increment counter and say hello
  handleIncrement = () => {
    this.incrementCounter();
    this.sayHello();
  };

  incrementCounter = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  sayHello = () => {
    alert("Hello! Counter updated.");
  };

  // Decrement counter
  handleDecrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  // 2. Say Welcome with argument
  sayWelcome = (message) => {
    alert(`Welcome! ${message}`);
  };

  // 3. Handle synthetic event (button click)
  handleButtonClick = (event) => {
    // Synthetic event in React
    alert("I was clicked");
    console.log("Event type:", event.type); // React's synthetic event
  };

  render() {
    return (
      <div className="App">
        <h1>React Event Handling Examples</h1>

        <section>
          <h2>Counter Example</h2>
          <p>Counter: <strong>{this.state.counter}</strong></p>
          <button onClick={this.handleIncrement}>Increase</button>
          <button onClick={this.handleDecrement}>Decrement</button>
        </section>

        <hr />

        <section>
          <h2>Say Welcome</h2>
          <button onClick={() => this.sayWelcome("Great to see you!")}>
            Say Welcome
          </button>
        </section>

        <hr />

        <section>
          <h2>Synthetic Event Example</h2>
          <button onClick={this.handleButtonClick}>
            OnPress (Click Me)
          </button>
        </section>

        <hr />

        <section>
          <h2>Currency Converter</h2>
          <CurrencyConverter />
        </section>
      </div>
    );
  }
}

export default App;