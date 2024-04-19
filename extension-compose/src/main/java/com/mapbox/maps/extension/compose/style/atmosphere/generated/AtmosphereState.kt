// This file is generated.

package com.mapbox.maps.extension.compose.style.atmosphere.generated

import android.os.Parcelable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import com.mapbox.bindgen.Value
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.extension.compose.style.atmosphere.AtmosphereStateApplier
import com.mapbox.maps.extension.compose.style.internal.ValueParceler
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.TypeParceler

/**
 * Create and [rememberSaveable] a [AtmosphereState] using [AtmosphereState.Saver].
 * [init] will be called when the [AtmosphereState] is first created to configure its
 * initial state.
 *
 * @param key An optional key to be used as a key for the saved value. If not provided we use the
 * automatically generated by the Compose runtime which is unique for the every exact code location
 * in the composition tree.
 * @param init A function initialise this [AtmosphereState].
 */
@Composable
@MapboxExperimental
public inline fun rememberAtmosphereState(
  key: String? = null,
  crossinline init: AtmosphereState.() -> Unit = {}
): AtmosphereState = rememberSaveable(key = key, saver = AtmosphereState.Saver) {
  AtmosphereState().apply(init)
}

/**
 * A global effect that fades layers and markers based on their distance to the camera. The fog can be used to approximate the effect of atmosphere on distant objects and enhance the depth perception of the map when used with terrain or 3D features. Note: fog is renamed to atmosphere in the Android and iOS SDKs and planned to be changed in GL-JS v.3.0.0.
 *
 * @see [The online documentation](https://docs.mapbox.com/mapbox-gl-js/style-spec/fog/)
 */
@MapboxExperimental
public class AtmosphereState(
  /**
   * The initial mutable properties of the source.
   */
  initialProperties: Map<String, Value> = mapOf()
) {

  internal val applier: AtmosphereStateApplier = AtmosphereStateApplier(initialProperties)

  /**
   * The color of the atmosphere region immediately below the horizon and within the `range` and above
   * the horizon and within `horizon-blend`. Using opacity is recommended only for smoothly transitioning fog on/off as
   * anything less than 100% opacity results in more tiles loaded and drawn.
   */
  public var color: Color
    get() = Color(applier.getProperty(Color.NAME) ?: Color.default.value)
    set(value) {
      applier.setProperty(Color.NAME, value.value)
    }

  /**
   * The color of the atmosphere region above the horizon, `high-color` extends further above the horizon than
   * the `color` property and its spread can be controlled with `horizon-blend`. The opacity can be set
   * to `0` to remove the high atmosphere color contribution.
   */
  public var highColor: HighColor
    get() = HighColor(applier.getProperty(HighColor.NAME) ?: HighColor.default.value)
    set(value) {
      applier.setProperty(HighColor.NAME, value.value)
    }

  /**
   * Horizon blend applies a smooth fade from the color of the atmosphere to the color of
   * space. A value of zero leaves a sharp transition from atmosphere to space. Increasing the value
   * blends the color of atmosphere into increasingly high angles of the sky.
   */
  public var horizonBlend: HorizonBlend
    get() = HorizonBlend(applier.getProperty(HorizonBlend.NAME) ?: HorizonBlend.default.value)
    set(value) {
      applier.setProperty(HorizonBlend.NAME, value.value)
    }

  /**
   * The start and end distance range in which fog fades from fully transparent to fully opaque.
   * The distance to the point at the center of the map is defined as zero, so
   * that negative range values are closer to the camera, and positive values are farther away.
   */
  public var range: Range
    get() = Range(applier.getProperty(Range.NAME) ?: Range.default.value)
    set(value) {
      applier.setProperty(Range.NAME, value.value)
    }

  /**
   * The color of the region above the horizon and after the end of the `horizon-blend` contribution.
   * The opacity can be set to `0` to have a transparent background.
   */
  public var spaceColor: SpaceColor
    get() = SpaceColor(applier.getProperty(SpaceColor.NAME) ?: SpaceColor.default.value)
    set(value) {
      applier.setProperty(SpaceColor.NAME, value.value)
    }

  /**
   * A value controlling the star intensity where `0` will show no stars and `1` will show
   * stars at their maximum intensity.
   */
  public var starIntensity: StarIntensity
    get() = StarIntensity(applier.getProperty(StarIntensity.NAME) ?: StarIntensity.default.value)
    set(value) {
      applier.setProperty(StarIntensity.NAME, value.value)
    }

  /**
   * An array of two number values, specifying the vertical range, measured in meters, over which the
   * fog should gradually fade out. When both parameters are set to zero, the fog will be
   * rendered without any vertical constraints.
   */
  public var verticalRange: VerticalRange
    get() = VerticalRange(applier.getProperty(VerticalRange.NAME) ?: VerticalRange.default.value)
    set(value) {
      applier.setProperty(VerticalRange.NAME, value.value)
    }

  /**
   * Atmosphere Holder class to be used within [Saver].
   */
  @MapboxExperimental
  @Parcelize
  @TypeParceler<Value, ValueParceler>
  public data class Holder(
    /**
     * Cached properties.
     */
    val cachedProperties: Map<String, Value>,
  ) : Parcelable

  /**
   * Public companion object.
   */
  public companion object {
    /**
     * The default saver implementation for [AtmosphereState]
     */
    public val Saver: Saver<AtmosphereState, Holder> = Saver(
      save = { it.applier.save() },
      restore = {
        AtmosphereState(
          initialProperties = it.cachedProperties,
        )
      }
    )

    /**
     * Default value for [AtmosphereState], setting default will result in restoring the property value defined in the style.
     */
    public val default: AtmosphereState = AtmosphereState()
  }
}
// End of generated file.