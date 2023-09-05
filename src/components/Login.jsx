import React, { useState } from "react";
import './LoginSignup.css'
//import Post from "./Post";
import { Link } from 'react-router-dom';
export const Login = (props) => {
    const [email, setEmail] = useState('');
    const [pass, setPass] = useState('');

    /*const handleSubmit = (e) => {
        e.preventDefault();
        console.log(email);
    }*/
    const handleLogin = (e) => {
        e.preventDefault();
    
        if (!email || !pass) {
          alert('Please enter both email and password.');
          return;
        }

        const isLoginSuccessful = true;
    
        if (isLoginSuccessful) {
          alert('Login unsuccessful!');
          setEmail('');
          setPass('');
        } else {
          alert('Login failed. Please check your credentials.');
        }
        //axios.post('http://127.0.0.1:8084/post', data)
      }; 

    return (
        <div className="auth-form-container">
            <h2>LOGIN</h2>
            <form className="login-form" onSubmit={handleLogin}>
                <label htmlFor="email">email</label>
                <input value={email} onChange={(e) => setEmail(e.target.value)}type="email" placeholder="youremail@gmail.com" id="email" name="email" />
                <label htmlFor="password">password</label>
                <input value={pass} onChange={(e) => setPass(e.target.value)} type="password" placeholder="********" id="password" name="password" />
                <button type="submit" ><Link  to="/Post">Login</Link></button>
            </form>
            <button className="link-btn">Don't have an account? Register here.<Link  to="/Register">Signup</Link></button>
        </div>
    )
}