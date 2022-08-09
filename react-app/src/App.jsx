import React from 'react';
import { BrowserRouter as Router, Routes, Route  } from 'react-router-dom';

import SideBar from './components/Sidebar';
import sidebar_menu from './constants/sidebar-menu';

import './App.css';
import Users from './pages/Users';
import CustomerBond from './pages/CustomerBond';
// import 'font-awesome/css/font-awesome.min.css';

function App () {
  return(
    <Router>
      <div className='dashboard-container'>
        <SideBar menu={sidebar_menu} />
          
          <div className='dashboard-body'>
              <Routes>
              <Route exact path="/customer-bonds" element={<CustomerBond/>} />
                  <Route path="*" element={<div></div>} />
                  <Route exact path="/" element={<div></div>} />
                  
                  <Route exact path="/admin/bonds" element={< Users/>} />
                  
                  {/* <Route exact path="/profile" element={<div></div>} /> */}
              </Routes>
          </div>
      </div>
    </Router>
  )
}

export default App;