import React from 'react';

const IndianPlayers = () => {
  const allPlayers = [
    "Rohit", "Virat", "KL Rahul", "Surya", "Pant",
    "Hardik", "Jadeja", "Bhuvi", "Bumrah", "Shami", "Chahal"
  ];

  const [oddTeam, evenTeam] = [
    allPlayers.filter((_, index) => index % 2 === 0), // 0, 2, 4...
    allPlayers.filter((_, index) => index % 2 === 1)  // 1, 3, 5...
  ];

  const T20players = ["Rohit", "Virat", "Bumrah", "Shami"];
  const RanjiTrophyPlayers = ["Ajinkya", "Cheteshwar", "Ishant", "Umesh"];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Indian Players</h2>

      <h3>Odd Team Players:</h3>
      <ul>
        {oddTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h3>Even Team Players:</h3>
      <ul>
        {evenTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h3>Merged Players (T20 + Ranji):</h3>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;