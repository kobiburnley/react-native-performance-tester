import {requireNativeComponent, View} from "react-native"
import PropTypes from "prop-types"

const iface = {
    name: "NiceButton",
    propTypes: {
        ...View.propTypes,
        title: PropTypes.string,
    },
};

export const NiceButton = requireNativeComponent("NiceButton", iface, {
    nativeOnly: {
        onChange: true,
    }
});
