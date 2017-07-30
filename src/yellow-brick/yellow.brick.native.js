import {requireNativeComponent, View} from "react-native"

const iface = {
    name: "YellowBrick",
    propTypes: {
        ...View.propTypes
    },
}

module.exports = requireNativeComponent("YellowBrick", iface)
