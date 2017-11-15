const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {
	
	constructor(props) {
		super(props);
		this.state = {notes: []};
	}
	
	componentDidMount() {
		client({method: 'GET', path: 'api/notes'}).done(response => {
			this.setState({notes: response.entity._embedded.employees});
		});
	}
	
	render() {
		return (
				<Notebook notes={this.state.notes}/>
		)
	}
}

class Notebook extends React.Component {
	render() {
		var notes = this.props.notes.map(
				<Note key={note._links.self.href} note={note}/>
		);
		return (
				<table>
					<tbody>
						<tr>
							<th>Title</th>
							<th>Content</th>
							<th>Publish Date</th>
						</tr>
						{notes}
					</tbody>
				</table>
		)
	}
}

class Note extends React.Component {
	render() {
		return (
				<tr>
					<td>{this.props.note.title}</td>
					<td>{this.props.note.content}</td>
					<td>{this.props.note.publishDate}</td>
				</tr>
		)
	}
}

ReactDOM.render(
		<App />,
		document.getElementById('react')
)
