import React, { Component } from 'react';

class CurrencyConverter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euros: '0.00',
    };
  }

  // Handle input change
  handleInputChange = (event) => {
    this.setState({
      rupees: event.target.value,
    });
  };

  // Handle form submission / Convert button click
  handleSubmit = (event) => {
    event.preventDefault(); // Prevent page reload
    const rupees = parseFloat(this.state.rupees);

    if (isNaN(rupees)) {
      alert("Please enter a valid number!");
      return;
    }

    // Conversion rate: 1 EUR = 88 INR (approximate)
    const euroValue = (rupees / 88).toFixed(2);
    this.setState({
      euros: euroValue,
    });
  };

  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <div>
          <label>
            Indian Rupees (INR):
            <input
              type="number"
              value={this.state.rupees}
              onChange={this.handleInputChange}
              placeholder="Enter amount in INR"
            />
          </label>
        </div>
        <br />
        <button type="submit">Convert to Euro (EUR)</button>
        <br /><br />
        <h3>Result: {this.state.euros} EUR</h3>
      </form>
    );
  }
}

export default CurrencyConverter;