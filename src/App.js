import './App.css';
import Delete from './components/Delete';
import Post from './components/Post';
import Get from './components/Get';
import Put from './components/Put';
import { Login } from './components/Login';
import { Register } from './components/Signup';
import { BrowserRouter as Router ,Route,Routes } from 'react-router-dom';

function App() {
  return (
    <Router>
    <div className="App">
      <Routes>
        <Route exact path='/' element={<Login/>}></Route>
        <Route exact path='/Register' element={<Register/>}></Route>
      <Route exact path='/Post' element={<Post />}></Route>
          <Route exact path='/Put' element={<Put />}></Route>
          <Route exact path='/Get' element={<Get />}></Route>
          <Route exact path='/Delete' element={<Delete />}></Route>
     </Routes>
    </div></Router>
  );
}

export default App