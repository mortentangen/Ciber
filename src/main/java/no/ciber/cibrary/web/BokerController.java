package no.ciber.cibrary.web;

import java.util.List;

import no.ciber.cibrary.domain.Bok;
import no.ciber.cibrary.service.BokService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BokerController {

	private static final Logger logger = LoggerFactory.getLogger(BokerController.class);
	
	private BokService bokService;

	@RequestMapping(value="/GetBoker", method=RequestMethod.GET)
	public @ResponseBody List<Bok> getBoker() {
		logger.warn("Henter bøker");
		return bokService.getBoker();
	}

	@Autowired
	public void setBokService(BokService bokService) {
		this.bokService = bokService;
	}
	
}
