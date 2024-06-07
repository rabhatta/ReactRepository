import React from 'react';
import { useState } from "react";

export function App() {
  const [name, setName] = useState("");
  const submit = () => {
    alert("Submitting the form !");
  }
  return (
    <form>
      <label>Serial Number:
        <input
          type="text" 
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
      </label><br/>
      <label>Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input
          type="text" 
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
      </label><br/>
      <label>Number of port
        <input
          type="text" 
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
      </label><br/>
      <label>Asset Type : 
        <input
          type="text" 
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
      </label><br/>
      <button onClick={submit}>Submit</button>
    </form>
  )
}

// Log to console
console.log('Hello console')
