package eTicaret.core.tools;

import eTicaret.business.abstracts.LoggerService;

public interface Runner {
	public static void runLoggers(LoggerService[] loggerServices, String message) {
        for (LoggerService loggerService : loggerServices) {
            loggerService.log(message);
        }
    }
}
