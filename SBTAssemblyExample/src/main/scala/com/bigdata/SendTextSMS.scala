package com.bigdata

import com.twilio.Twilio
import com.twilio.`type`.PhoneNumber
import com.twilio.rest.api.v2010.account.Message
import com.typesafe.config.ConfigFactory

object SendTextSMS {
  def main(args: Array[String]): Unit = {
    val config = ConfigFactory.load("application.conf")
    val twilioConfig = config.getConfig("com.scala.messaging.application.twilio")
    val ACCOUNT_SID = twilioConfig.getString("account_sid")
    val AUTH_TOKEN = twilioConfig.getString("auth_token")
    val FROM_NUMBER = twilioConfig.getString("from_number")
    val TO_NUMBER = "+14083731426"
    //val TO_NUMBER = "+919985892830"

    Twilio.init(ACCOUNT_SID, AUTH_TOKEN)

    val from = new PhoneNumber(FROM_NUMBER)
    val to = new PhoneNumber(TO_NUMBER)
    val body = "Hi Anand, \nThis is test message to test Twilio & Scala.\nFrom Ashok."
    //val body = "Hi ra Santosh, \nThis is test message generated using Scala & Twilio.\nFrom Ashok."

    val message = Message.creator(to, from, body).create()
    println(s"MESSAGE SENT SUCCESSFULLY TO NUMBER : ${TO_NUMBER} FROM SID : ${ACCOUNT_SID}")
  }
}
