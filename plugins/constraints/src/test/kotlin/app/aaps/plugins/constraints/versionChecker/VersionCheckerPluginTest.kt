package app.aaps.plugins.constraints.versionChecker

import app.aaps.core.objects.constraints.ConstraintObject
import app.aaps.shared.tests.TestBaseWithProfile
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class VersionCheckerPluginTest : TestBaseWithProfile() {

    private lateinit var versionCheckerPlugin: VersionCheckerPlugin

    @Test
    fun applyMaxIOBConstraintsTest() {
        versionCheckerPlugin = VersionCheckerPlugin(aapsLogger, rh, preferences)

        val c1 = ConstraintObject(Double.MAX_VALUE, aapsLogger)
        assertThat(versionCheckerPlugin.applyMaxIOBConstraints(c1).value()).isEqualTo(Double.MAX_VALUE)
    }
}
