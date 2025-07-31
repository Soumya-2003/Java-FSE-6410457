import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

import './App.css';

function App() {
  const [showComponent, setShowComponent] = useState('book'); // Default: Book

  return (
    <div className="App" style={{ padding: '20px', fontFamily: 'Arial, sans-serif' }}>
      <h1>📚 Blogger App</h1>

      <div style={{ marginBottom: '20px' }}>
        <button onClick={() => setShowComponent('book')}>Show Book</button>
        <button onClick={() => setShowComponent('blog')}>Show Blog</button>
        <button onClick={() => setShowComponent('course')}>Show Course</button>
      </div>

      <hr />

      
      {(() => {
        if (showComponent === 'book') {
          return <BookDetails />;
        } else if (showComponent === 'blog') {
          return <BlogDetails />;
        } else if (showComponent === 'course') {
          return <CourseDetails />;
        }
        return null;
      })()}

      <hr />

      {/* === METHOD 3: Ternary Operator (for single condition) === */}
      {/* Example: Show message if none selected */}
      {showComponent === 'none' ? <p>No component selected.</p> : null}

      {/* === METHOD 4: Logical && Operator === */}
      {showComponent === 'book' && (
        <p style={{ color: 'green' }}>You are viewing the Book Details.</p>
      )}
      {showComponent === 'blog' && (
        <p style={{ color: 'blue' }}>You are viewing the Blog Details.</p>
      )}
      {showComponent === 'course' && (
        <p style={{ color: 'purple' }}>You are viewing the Course Details.</p>
      )}
      
    </div>
  );
}

export default App;