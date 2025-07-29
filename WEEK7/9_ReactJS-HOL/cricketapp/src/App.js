import React from 'react';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';

function App() {
  const flag = true; 

  return (
    <div className="App">
      <header className="App-header">
        <h1>🏏 Cricket App</h1>
        {flag ? <ListofPlayers /> : <IndianPlayers />}
        
        <p><strong>Flag is: {flag ? 'true' : 'false'}</strong></p>
        <p>Change flag value in App.js to toggle components.</p>
      </header>
    </div>
  );
}

export default App;