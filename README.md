## 23种 设计模式讲解 
```
https://blog.csdn.net/q961250375/article/details/103717298

code is ok! working.....
 ```

# 软件设计模式概述

## 软件设计模式的产生背景
  “设计模式”这个术语最初并不是出现在软件设计中，而是被用于建筑领域的设计中。1977 年，美国著名建筑大师、加利福尼亚大学伯克利分校环境结构中心主任克里斯托夫·亚历山大（Christopher Alexander）在他的著作《建筑模式语言：城镇、建筑、构造（A Pattern Language: Towns Building Construction）中描述了一些常见的建筑设计问题，并提出了253种关于对城镇、邻里、住宅、花园和房间等进行设计的基本模式。
1979 年他的另一部经典著作《建筑的永恒之道》（The Timeless Way of Building）进一步强化了设计模式的思想，为后来的建筑设计指明了方向。
1987 年，肯特·贝克（Kent Beck）和沃德·坎宁安（Ward Cunningham）首先将克里斯托夫·亚历山大的模式思想应用在 Smalltalk 中的图形用户接口的生成中，但没有引起软件界的关注。
直到 1990 年，软件工程界才开始研讨设计模式的话题，后来召开了多次关于设计模式的研讨会。1995 年，艾瑞克·伽马（ErichGamma）、理査德·海尔姆（Richard Helm）、拉尔夫·约翰森（Ralph Johnson）、约翰·威利斯迪斯（John Vlissides）等 4 位作者合作出版了《设计模式：可复用面向对象软件的基础》（Design Patterns: Elements of Reusable Object-Oriented Software）一书，在本教程中收录了 23 个设计模式，这是设计模式领域里程碑的事件，导致了软件设计模式的突破。这 4 位作者在软件开发领域里也以他们的“四人组”（Gang of Four，GoF）匿名著称。

## 软件设计模式的概念和意义
  软件设计模式（Software Design Pattern），又称设计模式，是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结。它描述了在软件设计过程中的一些不断重复发生的问题，以及该问题的解决方案。也就是说，它是解决特定问题的一系列套路，是前辈们的代码设计经验的总结，具有一定的普遍性，可以反复使用。其目的是为了提高代码的可重用性、代码的可读性和代码的可靠性。

  设计模式的本质是面向对象设计原则的实际运用，是对类的封装性、继承性和多态性以及类的关联关系和组合关系的充分理解。
正确使用设计模式具有以下优点：
- 可以提高程序员的思维能力、编程能力和设计能力。
- 使程序设计更加标准化、代码编制更加工程化，使软件开发效率大大提高，从而缩短软件的开发周期。
- 使设计的代码可重用性高、可读性强、可靠性高、灵活性好、可维护性强。
 
  当然，软件设计模式只是一个引导。在具体的软件幵发中，必须根据设计的应用系统的特点和要求来恰当选择。对于简单的程序开发，苛能写一个简单的算法要比引入某种设计模式更加容易。但对大项目的开发或者框架设计，用设计模式来组织代码显然更好。

 ## 软件设计模式的分类
  根据设计模式的参考书 Design Patterns - Elements of Reusable Object-Oriented Software（中文译名：设计模式 - 可复用的面向对象软件元素）中所提到的，总共有 23 种设计模式。这些模式可以分为三大类：创建型模式（Creational Patterns）、结构型模式（Structural Patterns）、行为型模式（Behavioral Patterns）。当然，这里还会讨论另一类设计模式：J2EE 设计模式。
 
 
 
### 创建型模式（Creational Patterns）
  这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。创建型模式的主要关注点是“怎样创建对象？”，它的主要特点是“将对象的创建与使用分离”。这样可以降低系统的耦合度，使用者不需要关注对象的创建细节，对象的创建由相关的工厂来完成。就像我们去商场购买商品时，不需要知道商品是怎么生产出来一样，因为它们由专门的厂商生产。
     
     工厂模式（Factory Pattern）
     抽象工厂模式（Abstract Factory Pattern）
     单例模式（Singleton Pattern）
     建造者模式（Builder Pattern）
     原型模式（Prototype Pattern）
### 结构型模式（Structural Patterns）
  这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。结构型模式描述如何将类或对象按某种布局组成更大的结构。它分为类结构型模式和对象结构型模式，前者采用继承机制来组织接口和类，后者釆用组合或聚合来组合对象。由于组合关系或聚合关系比继承关系耦合度低，满足“合成复用原则”，所以对象结构型模式比类结构型模式具有更大的灵活性。

    适配器模式（Adapter Pattern）
    桥接模式（Bridge Pattern）
    过滤器模式（Filter、Criteria Pattern）
    组合模式（Composite Pattern）
    装饰器模式（Decorator Pattern）
    外观模式（Facade Pattern）
    享元模式（Flyweight Pattern）
    代理模式（Proxy Pattern）
 
### 行为型模式（Behavioral Patterns）
  这些设计模式特别关注对象之间的通信。行为型模式用于描述程序在运行时复杂的流程控制，即描述多个类或对象之间怎样相互协作共同完成单个对象都无法单独完成的任务，它涉及算法与对象间职责的分配。行为型模式分为类行为模式和对象行为模式，前者采用继承机制来在类间分派行为，后者采用组合或聚合在对象间分配行为。由于组合关系或聚合关系比继承关系耦合度低，满足“合成复用原则”，所以对象行为模式比类行为模式具有更大的灵活性。
 
    责任链模式（Chain of Responsibility Pattern）
    命令模式（Command Pattern）
    解释器模式（Interpreter Pattern）
    迭代器模式（Iterator Pattern）
    中介者模式（Mediator Pattern）
    备忘录模式（Memento Pattern）
    观察者模式（Observer Pattern）
    状态模式（State Pattern）
    空对象模式（Null Object Pattern）
    策略模式（Strategy Pattern）
    模板模式（Template Pattern）
    访问者模式（Visitor Pattern）