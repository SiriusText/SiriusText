package org.obeonetwork.sirius.text.ui.internal;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.obeonetwork.sirius.text.ui.internal.SiriusTextDslActivator;
import org.osgi.framework.BundleContext;

@SuppressWarnings("all")
public class SiriusTextUIPlugin extends SiriusTextDslActivator {
  public final static String PLUGIN_ID = "org.obeonetwork.sirius.text.ui";
  
  private final Map<String, Image> imageMap = CollectionLiterals.<String, Image>newHashMap();
  
  @Override
  public void stop(final BundleContext context) throws Exception {
    Collection<Image> _values = this.imageMap.values();
    final Iterator<Image> imageIterator = _values.iterator();
    while (imageIterator.hasNext()) {
      {
        final Image image = imageIterator.next();
        image.dispose();
      }
    }
    this.imageMap.clear();
    super.stop(context);
  }
  
  public Image getImage(final String path) {
    Image result = this.imageMap.get(path);
    boolean _equals = Objects.equal(result, null);
    if (_equals) {
      final ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(SiriusTextUIPlugin.PLUGIN_ID, path);
      boolean _notEquals = (!Objects.equal(descriptor, null));
      if (_notEquals) {
        Image _createImage = descriptor.createImage();
        result = _createImage;
        this.imageMap.put(path, result);
      }
    }
    return result;
  }
}
