package org.obeonetwork.sirius.text.ui.internal

import java.util.Map
import org.eclipse.swt.graphics.Image
import org.osgi.framework.BundleContext

class SiriusTextUIPlugin extends SiriusTextDslActivator {
	public static final String PLUGIN_ID = "org.obeonetwork.sirius.text.ui";
	
	val Map<String, Image> imageMap = newHashMap;
	
	override stop(BundleContext context) throws Exception {
		val imageIterator = imageMap.values().iterator()
		while (imageIterator.hasNext()) {
			val image = imageIterator.next()
			image.dispose()
		}
		imageMap.clear()
		
		super.stop(context)
	}
	
	def Image getImage(String path) {
		var result = imageMap.get(path)
		if (result == null) {
			val descriptor = imageDescriptorFromPlugin(PLUGIN_ID, path)
			if (descriptor != null) {
				result = descriptor.createImage()
				imageMap.put(path, result)
			}
		}
		return result
	}
}