///**
// *  将图片压缩并实现缩略图，图片格式为(jpg、bmp、png、gif等等)
// */
//package org.sagacity.util.image;
//
//import java.awt.Image;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import javax.imageio.ImageIO;
//
//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;
//
///**
// * 缩略图类（通用） 本java类能将jpg、bmp、png、gif图片文件，进行等比或非等比的大小转换。 具体使用方法
// * compress(大图片路径,生成小图片路径,大图片文件名,生成小图片文名,生成小图片宽度,生成小图片高度,是否等比缩放(默认为true))
// */
//public class ImageCompress {
//	private File file = null; // 文件对象
//	private String inputDir; // 输入图路径
//	private String outputDir; // 输出图路径
//	private String inputFileName; // 输入图文件名
//	private String outputFileName; // 输出图文件名
//	private int outputWidth = 400; // 默认输出图片宽
//	private int outputHeight = 300; // 默认输出图片高
//	private boolean proportion = true; // 是否等比缩放标记(默认为等比缩放)
//	
//	/**
//	 * 设置图片的长和宽
//	 * @param 
//	 * @name setWidthAndHeight
//	 * @active
//	 * @state
//	 * @type void
//	 * @time 上午8:52:55
//	 * @exception/throws
//	 * @see
//	 * @since
//	 * @param width
//	 * @param height
//	 */
//	public void setWidthAndHeight(int width, int height) {
//		this.outputWidth = width;
//		this.outputHeight = height;
//	}
//
//	/**
//	 * 图片缩放和压缩处理
//	 * @param 
//	 * @name compressPic
//	 * @active
//	 * @state
//	 * @type String
//	 * @time 上午8:52:29
//	 * @exception/throws
//	 * @see
//	 * @since
//	 * @return
//	 */
//	private boolean compressPic() {
//		try {
//			// 获得源文件
//			file = new File(inputDir + inputFileName);
//			if (!file.exists()) {
//				return false;
//			}
//			Image img = ImageIO.read(file);
//			// 判断图片格式是否正确
//			if (img.getWidth(null) == -1) {
//				System.out.println(" can't read,retry!" + "");
//				return false;
//			} else {
//				int newWidth;
//				int newHeight;
//				// 判断是否是等比缩放
//				if (this.proportion == true) {
//					// 为等比缩放计算输出的图片宽度及高度
//					double rate1 = ((double) img.getWidth(null))
//							/ (double) outputWidth + 0.1;
//					double rate2 = ((double) img.getHeight(null))
//							/ (double) outputHeight + 0.1;
//					// 根据缩放比率大的进行缩放控制
//					double rate = rate1 < rate2 ? rate1 : rate2;
//					newWidth = (int) (((double) img.getWidth(null)) / rate);
//					newHeight = (int) (((double) img.getHeight(null)) / rate);
//				} else {
//					newWidth = outputWidth; // 输出的图片宽度
//					newHeight = outputHeight; // 输出的图片高度
//				}
//				BufferedImage tag = new BufferedImage((int) newWidth,
//						(int) newHeight, BufferedImage.TYPE_INT_RGB);
//
//				/*
//				 * Image.SCALE_SMOOTH 的缩略算法 生成缩略图片的平滑度的 优先级比速度高 生成的图片质量比较好 但速度慢
//				 */
//				tag.getGraphics().drawImage(
//						img.getScaledInstance(newWidth, newHeight,
//								Image.SCALE_SMOOTH), 0, 0, null);
//				FileOutputStream out = new FileOutputStream(outputDir
//						+ outputFileName);
//				// JPEGImageEncoder可适用于其他图片类型的转换
//				JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
//				encoder.encode(tag);
//				out.close();
//			}
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
//		return true;
//	}
//
//	/**
//	 * 压缩和缩放图片
//	 * @name compress
//	 * @active
//	 * @state
//	 * @type String
//	 * @time 上午8:54:02
//	 * @exception/throws
//	 * @see
//	 * @since
//	 * @param inputDir 需要处理的图片路径
//	 * @param outputDir 处理后的图片保存路径
//	 * @param inputFileName 处理的图片名称
//	 * @param outputFileName 处理后的图片名称
//	 * @return boolean 是否处理成功
//	 */
//	public boolean compress(String inputDir, String outputDir,
//			String inputFileName, String outputFileName) {
//		// 输入图路径
//		this.inputDir = inputDir;
//		// 输出图路径
//		this.outputDir = outputDir;
//		// 输入图文件名
//		this.inputFileName = inputFileName;
//		// 输出图文件名
//		this.outputFileName = outputFileName;
//		return compressPic();
//	}
//
//	/**
//	 * 压缩和缩放图片
//	 * @name compress
//	 * @active
//	 * @state
//	 * @type boolean
//	 * @time 上午8:57:34
//	 * @exception/throws
//	 * @see
//	 * @since
//	 * @param inputDir 需要处理的图片路径
//	 * @param outputDir 处理后的图片保存路径
//	 * @param inputFileName 处理的图片名称
//	 * @param outputFileName 处理后的图片名称
//	 * @param width 压缩后的图片宽度
//	 * @param height 压缩后的图片高度
//	 * @param proportion 是否等比缩放
//	 * @return boolean 是否压缩成功
//	 */
//	public boolean compress(String inputDir, String outputDir,
//			String inputFileName, String outputFileName, int width, int height,
//			boolean proportion) {
//		// 输入图路径
//		this.inputDir = inputDir;
//		// 输出图路径
//		this.outputDir = outputDir;
//		// 输入图文件名
//		this.inputFileName = inputFileName;
//		// 输出图文件名
//		this.outputFileName = outputFileName;
//		// 设置图片长宽
//		setWidthAndHeight(width, height);
//		// 是否是等比缩放 标记
//		this.proportion = proportion;
//		return compressPic();
//	}
//}