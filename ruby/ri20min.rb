#!/usr/bin/env ruby
# 20 分鐘體驗ruby 練習檔案 from 官方網站
# https://www.ruby-lang.org/zh_tw/documentation/quickstart/3/

class MegaGreeter
  attr_accessor  :names

  # 初始化這個物件
  def initialize(names = "world")
    @names = names
  end

  # 向每個人說 hi
  def say_hi
    if @name.nil?
      puts "..."
    elsif @names.respond_to?("each")
      # @names 是可以迭代的陣列容器
      @names.each do |name|
        puts "Hello #{name}!"
      end
    else
      puts  "Hello #{@names}!"
    end
  end

  # 像每個人說 bye
  def say_bye
    if @name.nil?
      puts "..."
    elsif @names.respond_to?("join")
      # 用逗號將陣列中的元素串接成一個字串
      put "Goodbye #{@names.join(",")}. Come back soon"
    else
      puts "Goodbye #{@names}.  Comeback soon!"
    end
  end
end

if __FILE__ == $0
  mg = MegaGreeter.new
  mg.say_hi
  mg.say_bye

  #變更成 "Max"
  mg.names = "Max"
  mg.say_hi
  mg.say_bye

  #變更成一個名字的陣列
  mg.names = ["Albert", "Brenda", "Charles", "Dave", "Engelbert"]
  mg.say_hi
  mg.say_bye

  #變更成 nil
  mg.names = nil
  mg.say_hi
  mg.saybye
end



