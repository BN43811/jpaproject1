import React, { useState } from "react";
import './LoginSignup.css';
//import axios from "axios";
import { Link } from 'react-router-dom';
export const Register = (props) => {
    const [email, setEmail] = useState('');
    const [pass, setPass] = useState('');
    const [name, setName] = useState('');

    /*const handleSubmit = (e) => {
        e.preventDefault();
        console.log(email);
    }*/
    const handleSignup = (e) => {
        e.preventDefault();
    
        if (!email || !pass ||!name) {
          alert('Please enter all the columns.');
          return;
        }

        const isLoginSuccessful = true;
    
        if (isLoginSuccessful) {
          alert('Login successful!');
          setEmail('');
          setPass('');
          setName('');
        } else {
          alert('Login failed. Please check your credentials.');
        }
        //axios.post('http://127.0.0.1:8084/post', data)
      };

    return (
        <div className="auth-form-container">
            <h2>REGISTER</h2>
        <form className="register-form" onSubmit={handleSignup}>
            <label htmlFor="name">Full name</label>
            <input value={name} name="name" onChange={(e) => setName(e.target.value)} id="name" placeholder="full Name" />
            <label htmlFor="email">email</label>
            <input value={email} onChange={(e) => setEmail(e.target.value)}type="email" placeholder="youremail@gmail.com" id="email" name="email" />
            <label htmlFor="password">password</label>
            <input value={pass} onChange={(e) => setPass(e.target.value)} type="password" placeholder="********" id="password" name="password" />
            <button type="submit" ><Link  to="/Post">Signup</Link></button>
        </form>
        <button className="link-btn">Already have an account? Login here.<Link  to="/">Loginup</Link></button>
    </div>
    )
}