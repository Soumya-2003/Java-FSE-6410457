// src/components/CourseDetails.js
import React from 'react';

const CourseDetails = () => {
  const course = {
    name: "React for Beginners",
    instructor: "John Smith",
    duration: "6 weeks",
    platform: "Udemy"
  };

  return (
    <div style={{ border: '1px solid #ccc', padding: '10px', margin: '10px', borderRadius: '5px', backgroundColor: '#eef' }}>
      <h3>🎓 Course Details</h3>
      <p><strong>Name:</strong> {course.name}</p>
      <p><strong>Instructor:</strong> {course.instructor}</p>
      <p><strong>Duration:</strong> {course.duration}</p>
      <p><strong>Platform:</strong> {course.platform}</p>
    </div>
  );
};

export default CourseDetails;