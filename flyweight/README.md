#### 1. 定义
- 提供了减少对象数量从而改善应用所需的对象结构的方式；运用共享技术有效地支持大量细粒度的对象。
- 类型：结构型

#### 2. 使用场景
- 1. 常常应用于系统底层的开发，以便解决系统的性能问题
- 2. 系统有大量相似对象，需要缓冲池的场景

#### 3. 优点
- 1. 减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率。(减少开销)
- 2. 减少内存之外的其他资源占用

#### 4. 缺点
- 1. 关注内部/外部状态，关注线程安全问题
- 2. 是系统、程序的逻辑复杂化
#### 5. 扩展
- 1. 内部状态：在享元模式内部，内部的状态不会随着外部的改变而改变
- 2. 外部状态：外部状态的改变不会影响内部

#### 6. 相关设计模式
- 1. 享元模式和代理模式：
- 2. 享元模式和单例模式：

#### 7. 源码
- 1. Integer、Long：valueOf()

- 2. tomcat 的 GenericKeyObjectPool 的 borrowObject() 方法；





















