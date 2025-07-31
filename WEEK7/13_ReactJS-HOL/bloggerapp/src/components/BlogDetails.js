// src/components/BlogDetails.js
import React from 'react';

const BlogDetails = () => {
  const blog = {
    title: "Learning React Basics",
    author: "Jane Doe",
    date: "April 5, 2025",
    content: "This is a beginner-friendly guide to React components and JSX."
  };

  return (
    <div style={{ border: '1px solid #ccc', padding: '10px', margin: '10px', borderRadius: '5px', backgroundColor: '#f9f9f9' }}>
      <h3>📝 Blog Details</h3>
      <p><strong>Title:</strong> {blog.title}</p>
      <p><strong>Author:</strong> {blog.author}</p>
      <p><strong>Date:</strong> {blog.date}</p>
      <p><strong>Content:</strong> {blog.content}</p>
    </div>
  );
};

export default BlogDetails;