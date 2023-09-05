import React, { Component } from 'react';
import './Post.css';
import './LoginSignup.css';
import axios from 'axios';
import { Link } from 'react-router-dom';

class Post extends Component {
  constructor(props) {
    super(props);
    this.state = {
      id: '',
      product_id: '',
      product_name: '',
      product_type: '',
      product_category:'',
      price: ''
    };
  }

  handleIdChange = (event) => {
    this.setState({id: event.target.value });
  };

  handleProductIdChange = (event) => {
    this.setState({product_id: event.target.value });
  };

  handleProductNameChange = (event) => {
    this.setState({ product_name: event.target.value });
  };

  handleProductTypeChange = (event) => {
    this.setState({ product_type: event.target.value });
  };

  handleProductCategoryChange = (event) => {
    this.setState({ product_category: event.target.value });
  };

  handlePriceChange = (event) => {
    this.setState({ price: event.target.value });
  };

  handleSubmit = (event) => {
    event.preventDefault();
    const data = {
      id: this.state.id,
      product_id: this.state.product_id,
      product_name: this.state.product_name,
      product_type: this.state.product_type,
      product_category: this.state.product_category,
      price: this.state.price
    };

    axios.post('http://127.0.0.1:8084/post', data);
  };

  render() {
    return (
      <><body>
        <h1 className="head">Create Gift Product Details</h1>
      <form onSubmit={this.handleSubmit} className="sign-form">
        <label className="sign-label">Id</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.id}
          onChange={this.handleIdChange}
        />

        <label className="sign-label">Product_Id</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.product_id}
          onChange={this.handleProductIdChange}
        />

        <label className="sign-label">Product_Name</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.product_name}
          onChange={this.handleProductNameChange}
        />

        <label className="sign-label">Product_type</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.product_type}
          onChange={this.handleProductTypeChange}
        />

<label className="sign-label">Product_category</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.product_category}
          onChange={this.handleProductCategoryChange}
        />

        <label className="sign-label">Price</label>
        <input
          className="sign-input"
          type="text"
          value={this.state.price}
          onChange={this.handlePriceChange}
        />

        <button className="login-button" type="submit">
          Create
        </button>
      </form>
      
<button className='button1'>
        <Link  to="/Put" >Update</Link>
      </button >
      <button className='button2'>
        <Link  to="/Get">View</Link>
      </button>
      <button className='button3'>
        <Link  to="/Delete">Delete</Link>
      </button>
      </body></>
    );
  }
}

export default Post;