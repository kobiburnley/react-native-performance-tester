import * as React from "react"
import {Animated, Dimensions, View, Text, Button, TouchableHighlight} from "react-native"

export class YellowBrickReact extends React.Component {
    constructor() {
        super()
        this.state = {
            selectedIndex: 0
        }
    }

    onButtonPress = (selectedIndex) => {
        this.setState({
            selectedIndex
        })
    }

    createButton(i: number) {
        return <TouchableHighlight onPress={() => this.onButtonPress(i)}
                                   style={{
                                       flex: 1, alignItems: "center", justifyContent: "center",
                                       backgroundColor: this.state.selectedIndex === i ? "red" : "yellow"
                                   }}>
            <Text>{i}</Text>
        </TouchableHighlight>
    }


    render() {
        return <View style={{height: 60, flexDirection: "row", justifyContent: "center"}}>
            {this.createButton(1)}
            {this.createButton(2)}
            {this.createButton(3)}
            {this.createButton(4)}
        </View>

    }
}