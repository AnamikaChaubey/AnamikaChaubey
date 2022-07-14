/**
 * 
 */
package oreg.apache.maven.HRMStestingUAT.extension;

import com.tvd12.ezyfox.core.annotation.PackagesScan;
import com.tvd12.ezyfox.core.annotation.RoomContextConfiguration;

/**
 * @author tavandung12
 *
 */
@PackagesScan(packages = {
        "${package}.request"})
@RoomContextConfiguration
public class RoomConfig {

}
