import axios from "axios";
import './LoginSignup.css';
import React, { Component } from "react";
import { Link } from "react-router-dom";
import './Post.css';
class Get extends Component {
  state = {
  data: []
  }

  componentDidMount() {
  axios.get('http://127.0.0.1:8084/showDetails')
    .then(response => {
      this.setState({ data: response.data });
    })
    .catch(error => {
      console.log(error);
    });
}


  render() {   
    return (
        <div className="box2" id="p">
      <table border={1}>
      <thead>
        <tr>
          <th>id</th>
          <th>product_id</th>
          <th>product_name</th>
          <th>product_type</th>
          <th>product_category</th>
          <th>price</th>
        </tr>
      </thead>
      <tbody>
        {this.state.data.map(user => (
          <tr key={user.id}>
            <td>{user.id}</td>
            <td>{user.product_id}</td>
            <td>{user.product_name}</td>
            <td>{user.product_type}</td>
            <td>{user.product_category}</td>
            <td>{user.price}</td>
          </tr>
        ))}
      </tbody>
    </table>
<div className="bt">
    <button className="button1">
        <Link to="/Post">Add</Link>
        </button>
        <button className="button2">
        <Link to="/Put" >Update</Link>
        </button>
        <button className="button3">
        <Link to="/Delete">Delete</Link>
        </button></div>
    </div>
    );
  }}
  
export default Get;