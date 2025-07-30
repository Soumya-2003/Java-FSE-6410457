import React from 'react';
import './App.css';

function App() {
  // Featured office object
  const office = {
    name: "TechHub Co-Working Space",
    rent: 55000,
    address: "123 Innovation Street, Tech City",
    image: "https://via.placeholder.com/400x200?text=Office+Space"
  };

  // List of office spaces
  const officeList = [
    { name: "Startup Loft", rent: 45000, address: "101 Founders Ave" },
    { name: "Premium Tower", rent: 75000, address: "202 Business Blvd" },
    { name: "Green Workspace", rent: 58000, address: "303 Eco Park" },
    { name: "Skyline Office", rent: 85000, address: "404 Highrise St" },
    { name: "Budget Desk", rent: 35000, address: "505 Small Unit" }
  ];

  // Dynamic class for rent color
  const getRentClass = (rent) => {
    return rent > 60000 ? 'rent-high' : 'rent-low';
  };

  return (
    <div className="App">
      <h1 className="heading">🏢 Office Space Rental App</h1>

      <div className="featured-office">
        <h2>{office.name}</h2>
        <img src={office.image} alt="Office Space" />
        <p><strong>Address:</strong> {office.address}</p>
        <p>
          <strong>Rent:</strong>{' '}
          <span className={getRentClass(office.rent)}>₹{office.rent}/month</span>
        </p>
      </div>

      <h2 className="list-heading">Available Office Spaces</h2>
      <ul className="office-list">
        {officeList.map((space, index) => (
          <li key={index} className="office-item">
            <div className="office-card">
              <h3>{space.name}</h3>
              <p><strong>Address:</strong> {space.address}</p>
              <p>
                <strong>Rent:</strong>{' '}
                <span className={getRentClass(space.rent)}>₹{space.rent}/month</span>
              </p>
            </div>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;