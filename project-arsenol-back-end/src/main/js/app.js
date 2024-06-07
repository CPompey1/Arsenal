const React = require('react'); (1)
const ReactDOM = require('react-dom'); (2)
// const client = require('./client'); (3)

class App extends React.Component { 

  render () {
    return (<h1>Added with react</h1>)
  }
	
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)