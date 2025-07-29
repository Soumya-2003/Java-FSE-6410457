import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Rohit Sharma", score: 85 },
    { name: "Virat Kohli", score: 92 },
    { name: "KL Rahul", score: 67 },
    { name: "Suryakumar Yadav", score: 73 },
    { name: "Rishabh Pant", score: 58 },
    { name: "Hardik Pandya", score: 76 },
    { name: "Ravindra Jadeja", score: 64 },
    { name: "Bhuvneshwar Kumar", score: 45 },
    { name: "Jasprit Bumrah", score: 32 },
    { name: "Mohammed Shami", score: 50 },
    { name: "Yuzvendra Chahal", score: 40 },
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
        <h2>List of Players</h2>
        <h3>Low Scorers (Score &lt; 70):</h3>
        <ul>
            {lowScorers.map(player => (

                <li key={player.name}>
                    {player.name} - Score: {player.score}
                </li>
            ))}
        </ul>
    </div>
  );
};

export default ListofPlayers;
