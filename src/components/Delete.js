import React, { Component } from 'react';
import './LoginSignup.css';
import axios from 'axios';
import { Link } from 'react-router-dom';
import './Post.css';
class Delete extends Component {
  constructor(props) {
    super(props);
    this.state = {
    id: ''
    };
  }

  handleIdChange = (event) => {
    this.setState({ id: event.target.value });
  };

  handleDelete = (event) => {
    event.preventDefault();
    axios.delete(`http://127.0.0.1:8084/deleteDetails/${this.state.id}`);
  };

  render() {
    return (
      <body>
      <form onSubmit={this.handleDelete} className="delete-form">
      <br/><br/><br/><label className="delete-label">Id</label><br/><br/>
        <input
          className="delete-input"
          type="text"
          value={this.state.id}
          onChange={this.handleIdChange}
        /><br/><br/>

        <button className="button1" type="submit">
          Delete
        </button><br/><br/><button className="button1">
      <Link  to="/Post" >Add</Link>
      </button>
      <button className="button2">
        <Link  to="/Put" >Update</Link>
      </button>
      <button className="button3">
        <Link  to="/Get" >View</Link>
      </button>
      </form></body>
    );
  }
}

export default Delete;