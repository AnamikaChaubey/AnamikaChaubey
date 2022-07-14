/**
 * 
 */
package oreg.apache.maven.HRMStestingUAT.extension;

import com.tvd12.ezyfox.core.annotation.PackagesScan;

/**
 * @author tavandung12
 *
 */
@PackagesScan(packages = {
        "${package}.entities", 
        "${package}.event",
        })
public class AppConfig {

}
