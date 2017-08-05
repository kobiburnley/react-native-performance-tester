import * as React from "react"
import {Animated, Dimensions, View, Text, Button, TouchableHighlight} from "react-native"
import {NiceButton} from './nice.button'

export class YellowBrickReact extends React.Component {
    constructor() {
        super();
        this.state = {
            selectedIndex: 0
        }
    }

    onButtonPress = (selectedIndex) => {
        this.setState({
            selectedIndex
        })
    };

    createButton(i: number) {
        return <TouchableHighlight onPress={() => this.onButtonPress(i)}
                                   style={{
                                       flex: 1, alignItems: "center", justifyContent: "center",
                                       backgroundColor: this.state.selectedIndex === i ? "red" : "yellow"
                                   }}>
            <Text>{i}</Text>
        </TouchableHighlight>
    }

    createButton2(i: number) {
        return <NiceButton onChange={() => this.onButtonPress(i)}
                           title={i + ""}
                           style={{
                               flex: 1, alignItems: "center", justifyContent: "center",
                               backgroundColor: this.state.selectedIndex === i ? "red" : "yellow"
                           }}>
        </NiceButton>
    }


    render() {
        return <View style={{height: 60, flexDirection: "row", justifyContent: "center"}}>
            {this.createButton2(1)}
            {this.createButton2(2)}
            {this.createButton2(3)}
            {this.createButton2(4)}
        </View>

    }
}