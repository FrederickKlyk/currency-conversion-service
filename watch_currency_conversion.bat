@echo off
Powershell.exe -NoExit -executionpolicy remotesigned while(1){curl http://104.199.7.89:8100/currency-conversion-feign/from/USD/to/INR/quantity/10; sleep 1; clear}