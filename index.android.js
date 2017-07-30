/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, {Component} from 'react';
import {
    AppRegistry,
    StyleSheet,
    Text,
    View
} from 'react-native';
import {YellowBrickReact} from "./src/yellow-brick/yellow.brick.react";
import YellowBrickNative from "./src/yellow-brick/yellow.brick.native";


export default class RNPerformanceTester extends Component {
    render() {
        return (
            <View style={{flex: 1, backgroundColor: "#5ee", padding: 20}}>
                <YellowBrickReact/>
                <YellowBrickNative style={{height: 60, flexDirection: "row", justifyContent: "center", marginTop: 50}}/>
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
    },
    welcome: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    },
    instructions: {
        textAlign: 'center',
        color: '#333333',
        marginBottom: 5,
    },
});

AppRegistry.registerComponent('RNPerformanceTester', () => RNPerformanceTester);
